package pokemon;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Battel {
    Pokemonster pikachu=new Pokemonster("피카츄", "전기", 50, 40, 35, 5, 0);
    Pokemonster charmander=new Pokemonster("파이리", "불", 52, 43, 39, 5, 0);
    Pokemonster bulbasaur=new Pokemonster("이상해씨", "풀", 49, 49, 45, 5, 0);
    Pokemonster squirtle=new Pokemonster("꼬부기", "물", 48, 65, 44, 5, 0);
    Pokemonster[] pokemonster= {pikachu,charmander,bulbasaur,squirtle};
    //포켓몬을 선택하기 위한 배열
    JFrame frame = new JFrame("Pokemon");
    int WIDTH=1200;
    int HEIGHT=800;
    public Battel() {
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //포켓몬 선택 화면
        frame.getContentPane().setLayout(null);
        //피카츄 선택 버튼
        JButton btn1 = new JButton("피카츄");
        btn1.setBounds(200,500,300,150);
        frame.getContentPane().add(btn1);
        //파이리 선택 버튼
        JButton btn2 = new JButton("파이리");
        btn2.setBounds(700,500,300,150);
        frame.getContentPane().add(btn2);
        //이상해씨 선택 버튼
        JButton btn3 = new JButton("이상해씨");
        btn3.setBounds(200,200,300,150);
        frame.getContentPane().add(btn3);
        //꼬부기 선택 버튼
        JButton btn4 = new JButton("꼬부기");
        btn4.setBounds(700,200,300,150);
        frame.getContentPane().add(btn4);
        //포켓몬 선택 버튼을 누른뒤 바로 배틀 화면으로 전환
        btn1.addActionListener((ActionListener) new Battel());
        btn2.addActionListener((ActionListener) new Battel());
        btn3.addActionListener((ActionListener) new Battel());
        btn4.addActionListener((ActionListener) new Battel());
        
    }
    public void go() {
        frame.setVisible(true);
    }






}
