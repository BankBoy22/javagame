package pokemon;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
    int level=0;
    String player_name = "플레이어";
    String enemy_name = "라이벌";
    public Battel(String player_name, String enemy_name) {
        this.player_name = player_name;
        this.enemy_name = enemy_name;
        JLabel select_label = new JLabel(player_name+"님 포켓몬을 선택하세요");
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        //포켓몬 선택 화면
        frame.getContentPane().setLayout(null);
        //피카츄 선택 버튼
        JButton btn1 = new JButton("피카츄");
        btn1.setBounds(200,500,150,150);
        btn1.setBackground(java.awt.Color.YELLOW);
        frame.getContentPane().add(btn1);
        //파이리 선택 버튼
        JButton btn2 = new JButton("파이리");
        btn2.setBounds(700,500,150,150);
        btn2.setBackground(java.awt.Color.RED);
        frame.getContentPane().add(btn2);
        //이상해씨 선택 버튼
        JButton btn3 = new JButton("이상해씨");
        btn3.setBounds(200,200,150,150);
        btn3.setBackground(java.awt.Color.GREEN);
        frame.getContentPane().add(btn3);
        //꼬부기 선택 버튼
        JButton btn4 = new JButton("꼬부기");
        btn4.setBounds(700,200,150,150);
        btn4.setBackground(java.awt.Color.BLUE);
        frame.getContentPane().add(btn4);
        //포켓몬을 선택하세요 텍스트 상단에 띄우기
        select_label.setBounds(500, 50, 200, 50);
        frame.getContentPane().add(select_label);
        //피카츄 선택 버튼 이벤트
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                //포켓몬 선택 화면을 지우고
                //난이도 선택
                JLabel select_label2 = new JLabel("난이도를 선택하세요");
                select_label2.setBounds(500, 50, 200, 50);
                frame.getContentPane().add(select_label2);
                //초급 난이도 버튼
                JButton b_btn1 = new JButton("초급");
                b_btn1.setBounds(300,100,600,200);
                b_btn1.setBackground(java.awt.Color.YELLOW);
                frame.getContentPane().add(b_btn1);
                //중급 난이도 버튼
                JButton b_btn2 = new JButton("중급");
                b_btn2.setBounds(300,300,600,200);
                b_btn2.setBackground(java.awt.Color.RED);
                frame.getContentPane().add(b_btn2);
                //고급 난이도 버튼
                JButton b_btn3 = new JButton("고급");
                b_btn3.setBounds(300,500,600,200);
                b_btn3.setBackground(java.awt.Color.GREEN);
                frame.getContentPane().add(b_btn3);
                //뒤로가기 버튼 생성
                JButton back_btn = new JButton("뒤로가기");
                back_btn.setBounds(1000, 700, 150, 50);
                frame.getContentPane().add(back_btn);
                //뒤로가기 버튼을 누르면 포켓몬 선택 화면으로 돌아감
                back_btn.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        frame.getContentPane().removeAll();
                        frame.repaint();
                        frame.getContentPane().setLayout(null);
                        frame.getContentPane().add(btn1);
                        frame.getContentPane().add(btn2);
                        frame.getContentPane().add(btn3);
                        frame.getContentPane().add(btn4);
                        frame.getContentPane().add(select_label);
                    }
                });
                //초급 난이도 버튼을 선택하면 level = 1 로 설정하고 배틀 화면 메소드 실행
                b_btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 1;
                        battle(level);
                    }
                });
                //중급 난이도 버튼을 선택하면 level = 2 로 설정하고 배틀 화면 메소드 실행
                b_btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 2;
                        battle(level);
                    }
                });
                //고급 난이도 버튼을 선택하면 level = 3 로 설정하고 배틀 화면 메소드 실행
                b_btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 3;
                        battle(level);
                    }
                });


        }});
        //파이리 선택 버튼 이벤트
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                //포켓몬 선택 화면을 지우고
                //난이도 선택
                JLabel select_label2 = new JLabel("난이도를 선택하세요");
                select_label2.setBounds(500, 50, 200, 50);
                frame.getContentPane().add(select_label2);
                //초급 난이도 버튼
                JButton b_btn1 = new JButton("초급");
                b_btn1.setBounds(300,100,600,200);
                b_btn1.setBackground(java.awt.Color.YELLOW);
                frame.getContentPane().add(b_btn1);
                //중급 난이도 버튼
                JButton b_btn2 = new JButton("중급");
                b_btn2.setBounds(300,300,600,200);
                b_btn2.setBackground(java.awt.Color.RED);
                frame.getContentPane().add(b_btn2);
                //고급 난이도 버튼
                JButton b_btn3 = new JButton("고급");
                b_btn3.setBounds(300,500,600,200);
                b_btn3.setBackground(java.awt.Color.GREEN);
                frame.getContentPane().add(b_btn3);
                //뒤로가기 버튼 생성
                JButton back_btn = new JButton("뒤로가기");
                back_btn.setBounds(1000, 700, 150, 50);
                frame.getContentPane().add(back_btn);
                //뒤로가기 버튼을 누르면 포켓몬 선택 화면으로 돌아감
                back_btn.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        frame.getContentPane().removeAll();
                        frame.repaint();
                        frame.getContentPane().setLayout(null);
                        frame.getContentPane().add(btn1);
                        frame.getContentPane().add(btn2);
                        frame.getContentPane().add(btn3);
                        frame.getContentPane().add(btn4);
                        frame.getContentPane().add(select_label);
                    }
                });
                //초급 난이도 버튼을 선택하면 level = 1 로 설정하고 배틀 화면 메소드 실행
                b_btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 1;
                        battle(level);
                    }
                });
                //중급 난이도 버튼을 선택하면 level = 2 로 설정하고 배틀 화면 메소드 실행
                b_btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 2;
                        battle(level);
                    }
                });
                //고급 난이도 버튼을 선택하면 level = 3 로 설정하고 배틀 화면 메소드 실행
                b_btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 3;
                        battle(level);
                    }
                });
        }});
        //이상해씨 선택 버튼 이벤트
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                //포켓몬 선택 화면을 지우고
                //난이도 선택
                JLabel select_label2 = new JLabel("난이도를 선택하세요");
                select_label2.setBounds(500, 50, 200, 50);
                frame.getContentPane().add(select_label2);
                //초급 난이도 버튼
                JButton b_btn1 = new JButton("초급");
                b_btn1.setBounds(300,100,600,200);
                b_btn1.setBackground(java.awt.Color.YELLOW);
                frame.getContentPane().add(b_btn1);
                //중급 난이도 버튼
                JButton b_btn2 = new JButton("중급");
                b_btn2.setBounds(300,300,600,200);
                b_btn2.setBackground(java.awt.Color.RED);
                frame.getContentPane().add(b_btn2);
                //고급 난이도 버튼
                JButton b_btn3 = new JButton("고급");
                b_btn3.setBounds(300,500,600,200);
                b_btn3.setBackground(java.awt.Color.GREEN);
                frame.getContentPane().add(b_btn3);
                //뒤로가기 버튼 생성
                JButton back_btn = new JButton("뒤로가기");
                back_btn.setBounds(1000, 700, 150, 50);
                frame.getContentPane().add(back_btn);
                //뒤로가기 버튼을 누르면 포켓몬 선택 화면으로 돌아감
                back_btn.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        frame.getContentPane().removeAll();
                        frame.repaint();
                        frame.getContentPane().setLayout(null);
                        frame.getContentPane().add(btn1);
                        frame.getContentPane().add(btn2);
                        frame.getContentPane().add(btn3);
                        frame.getContentPane().add(btn4);
                        frame.getContentPane().add(select_label);
                    }
                });
                //초급 난이도 버튼을 선택하면 level = 1 로 설정하고 배틀 화면 메소드 실행
                b_btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 1;
                        battle(level);
                    }
                });
                //중급 난이도 버튼을 선택하면 level = 2 로 설정하고 배틀 화면 메소드 실행
                b_btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 2;
                        battle(level);
                    }
                });
                //고급 난이도 버튼을 선택하면 level = 3 로 설정하고 배틀 화면 메소드 실행
                b_btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 3;
                        battle(level);
                    }
                });
        }});
        //꼬부기 선택 버튼 이벤트
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.repaint();
                //포켓몬 선택 화면을 지우고
                //난이도 선택
                JLabel select_label2 = new JLabel("난이도를 선택하세요");
                select_label2.setBounds(500, 50, 200, 50);
                frame.getContentPane().add(select_label2);
                //초급 난이도 버튼
                JButton b_btn1 = new JButton("초급");
                b_btn1.setBounds(300,100,600,200);
                b_btn1.setBackground(java.awt.Color.YELLOW);
                frame.getContentPane().add(b_btn1);
                //중급 난이도 버튼
                JButton b_btn2 = new JButton("중급");
                b_btn2.setBounds(300,300,600,200);
                b_btn2.setBackground(java.awt.Color.RED);
                frame.getContentPane().add(b_btn2);
                //고급 난이도 버튼
                JButton b_btn3 = new JButton("고급");
                b_btn3.setBounds(300,500,600,200);
                b_btn3.setBackground(java.awt.Color.GREEN);
                frame.getContentPane().add(b_btn3);
                //뒤로가기 버튼 생성
                JButton back_btn = new JButton("뒤로가기");
                back_btn.setBounds(1000, 700, 150, 50);
                frame.getContentPane().add(back_btn);
                //뒤로가기 버튼을 누르면 포켓몬 선택 화면으로 돌아감
                back_btn.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        frame.getContentPane().removeAll();
                        frame.repaint();
                        frame.getContentPane().setLayout(null);
                        frame.getContentPane().add(btn1);
                        frame.getContentPane().add(btn2);
                        frame.getContentPane().add(btn3);
                        frame.getContentPane().add(btn4);
                        frame.getContentPane().add(select_label);
                    }
                });
                //초급 난이도 버튼을 선택하면 level = 1 로 설정하고 배틀 화면 메소드 실행
                b_btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 1;
                        battle(level);
                    }
                });
                //중급 난이도 버튼을 선택하면 level = 2 로 설정하고 배틀 화면 메소드 실행
                b_btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 2;
                        battle(level);
                    }
                });
                //고급 난이도 버튼을 선택하면 level = 3 로 설정하고 배틀 화면 메소드 실행
                b_btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        level = 3;
                        battle(level);
                    }
                });
        }});

    }
    public void setVisible(boolean b) {
        frame.setVisible(b);
    }

    //난이도 값을 입력 받는 배틀 화면 메소드
    public void battle(int level) {
        //배틀 화면 생성
        frame.getContentPane().removeAll();
        frame.repaint();
        frame.getContentPane().setLayout(null);
    }






}
