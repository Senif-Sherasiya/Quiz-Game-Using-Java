import java.util.*;
class run{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("       ~QUIZ GAME~");
        System.out.println("Rules of this quiz\n   1.This quiz contains 25 questions with 5 different categories\n   " +
                "2.+4 marks for correct and -1 mark for incorrect\n   "+
                "3.You must answer the question and valid answer otherwise it consider as incorrect");
        System.out.println("             All The Best");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  Enter no. of student appearing in quiz");
        int n=sc.nextInt();
        question []que=new question[25];
        players []p=new players[n];
        sc.nextLine();
        for(int j=0;j<p.length;j++){
            p[j]=new players();
            System.out.println("enter name of player:"+(1+j));
            p[j].name=sc.nextLine();
        }
        for(int j=0;j<que.length;j++){
            que[j]=new question();
        }
        //general knowledge questions
        que[0].QuestionText="  Q1. What is the capital city of Australia?";
        que[0].options="      1) Sydney 2) Melbourne 3) Canberra 4) Brisbane";
        que[0].correctOption=3;

        que[1].QuestionText="  Q2. Which planet is known as the Red Planet?";
        que[1].options="      1) Earth 2) Mars 3) Venus 4) Jupiter";
        que[1].correctOption=2;

        que[2].QuestionText="  Q3. how many spokes present in indian flag";
        que[2].options="      1) 20 2) 24 3) 26 4) 28";
        que[2].correctOption=2;

        que[3].QuestionText="  Q4. Who wrote the play Romeo and Juliet?";
        que[3].options="      1) William Shakespeare 2) Charles Dickens 3) Jane Austen 4) Mark Twain";
        que[3].correctOption=1;

        que[4].QuestionText="  Q5. which is gift city of gujarat";
        que[4].options="      1) Gandhinagar 2) Surat 3) Anand 4) Rajkot";
        que[4].correctOption=1;

        //science question
        que[5].QuestionText="  Q1.  What is the chemical symbol for gold?";
        que[5].options="      1)Au  2)Ag  3)Fe  4)Hg";
        que[5].correctOption=1;

        que[6].QuestionText="  Q2. What is the powerhouse of the cell?";
        que[6].options="      1) Nucleus 2) Ribosome 3) Mitochondria 4) Endoplasmic reticulum";
        que[6].correctOption=3;

        que[7].QuestionText="  Q3. What planet is known as the Red Planet?";
        que[7].options="      1) Mars 2) Jupiter 3) Venus 4) Mercury";
        que[7].correctOption=1;

        que[8].QuestionText="  Q4. What is the largest organ in the human body?";
        que[8].options="      1) Liver 2) Heart 3) Skin 4) Brain";
        que[8].correctOption=3;

        que[9].QuestionText="  Q5. What is the speed of light in a vacuum?";
        que[9].options="      1) 300,000 km/s 2) 150,000 km/s 3) 500,000 km/s 4) 1,000,000 km/s";
        que[9].correctOption=1;

        //history questions

        que[10].QuestionText="  Q1. Who was the first President of the United States?";
        que[10].options="      1) Thomas Jefferson 2) John Adams 3) George Washington 4) Abraham Lincoln";
        que[10].correctOption=3;

        que[11].QuestionText="  Q2. What ancient wonder was located in Alexandria, Egypt?";
        que[11].options="      1) Great Wall of China 2) Hanging Gardens of Babylon 3) Lighthouse of Alexandria 4) Colossus of Rhodes";
        que[11].correctOption=3;

        que[12].QuestionText="  Q3. In what year did World War II end?";
        que[12].options="      1)1943  2) 1945 3) 1947 4) 1950";
        que[12].correctOption=2;

        que[13].QuestionText="  Q4. Who was the famous nurse during the Crimean War known as the Lady with the Lamp?";
        que[13].options="      1) Clara Barton 2) Florence Nightingale 3) Mary Seacole 4) Dorothea Dix";
        que[13].correctOption=2;

        que[14].QuestionText="  Q5. What event marked the beginning of the French Revolution?";
        que[14].options="      1) Storming of the Bastille 2) Battle of Waterloo 3) Reign of Terror 4) Execution of Louis XVI";
        que[14].correctOption=1;

        //Geography questions

        que[15].QuestionText="  Q1. Which rive1r is the longest in the world?";
        que[15].options="      1) Amazon River 2) Nile River 3) Yangtze River 4) Mississippi River";
        que[15].correctOption=2;

        que[16].QuestionText="  Q2. Name the seven continents.";
        que[16].options="      1) North America, South America, Europe, Asia, Africa, Australia, Antarctica\n" +
                "      2) North America, South America, Europe, Asia, Africa, India, Antarctica\n" +
                "      3) North America, South America, Europe, Asia, Africa, Australia, Arctic\n" +
                "      4) North America, South America, Europe, Asia, Africa, Australia, Greenland";
        que[16].correctOption=1;

        que[17].QuestionText="  Q3. What is the capital of Japan?";
        que[17].options="      1) Seoul 2) Beijing 3) Tokyo 4) Bangkok";
        que[17].correctOption=3;

        que[18].QuestionText="  Q4. Which mountain range is the longest in the world?";
        que[18].options="      1) Andes 2) Alps 3) Himalayas 4) Rocky Mountains";
        que[18].correctOption=3;

        que[19].QuestionText="  Q5. In which ocean is the Bermuda Triangle located?";
        que[19].options="      1) Pacific Ocean 2) Indian Ocean 3) Atlantic Ocean 4) Arctic Ocean";
        que[19].correctOption=3;

        //Entertainment question

        que[20].QuestionText="  Q1. Who played Jack Dawson in the movie \"Titanic\"?";
        que[20].options="      1) Brad Pitt 2) Leonardo DiCaprio 3) Tom Hanks 4) Johnny Depp";
        que[20].correctOption=2;

        que[21].QuestionText="  Q2. What is the highest-grossing animated film of all time?";
        que[21].options="      1) The Lion King 2) Frozen 3) Toy Story 4 4) Avatar";
        que[21].correctOption=3;

        que[22].QuestionText="  Q3. Who wrote the Harry Potter book series?";
        que[22].options="      1) J.K. Rowling 2) Stephen King 3) George R.R. Martin 4) Roald Dahl";
        que[22].correctOption=1;

        que[23].QuestionText="  Q4. In which year was the first episode of \"Friends\" aired?";
        que[23].options="      1) 1994 2) 1996 3) 1998 4) 2000";
        que[23].correctOption=1;

        que[24].QuestionText="  Q5. What is the name of the fictional wizarding school in the Harry Potter series?";
        que[24].options="      1) Hogwarts 2) Durmstrang 3) Beauxbatons 4) Ilvermorny";
        que[24].correctOption=1;

        System.out.println("");
        for(int j=0;j<p.length;j++) {
            System.out.println("# "+p[j].name+"'s turn");
            System.out.println("-----------------------------------------");
             for (int i = 0; i < que.length; i++) {
                  que[i].startQuiz();
                if (que[i].sco == 1) {
                    que[i].sco=0;
                    p[j].score+=4;
                    if(i>=0 && i<5){
                        p[j].cat1+=4;
                    }
                    if(i>=5 && i<10){
                        p[j].cat2+=4;
                    }
                    if(i>=10 && i<15){
                        p[j].cat3+=4;
                    }
                    if(i>=15 && i<20){
                        p[j].cat4+=4;
                    }
                    if(i>=20 && i<25){
                        p[j].cat5+=4;
                    }
                }
                else{
                    p[j].score--;
                    if(i>=0 && i<5){
                        p[j].cat1--;
                    }
                    if(i>=5 && i<10){
                        p[j].cat2--;
                    }
                    if(i>=10 && i<15){
                        p[j].cat3--;
                    }
                    if(i>=15 && i<20){
                        p[j].cat4--;
                    }
                    if(i>=20 && i<25){
                        p[j].cat5--;
                    }
                }
             }
        }
        System.out.println("       ~Quiz completed~");
        System.out.println("Hope you all performed very well");
            int max=-26;
            int temp=-1;
        for(int i=0;i<p.length;i++){
            if(p[i].score>max){
                max=p[i].score;
                temp=i;
            }
        }
        for(int i=0;i<p.length;i++){
            System.out.println("# "+p[i].name+"'s result");
            System.out.println("");
            System.out.println("marks of category: GK is "+p[i].cat1);
            System.out.println("marks of category: Science is "+p[i].cat2);
            System.out.println("marks of category: History is "+p[i].cat3);
            System.out.println("marks of category: Geography is "+p[i].cat4);
            System.out.println("marks of category: Entertainment is "+p[i].cat5);
            int total=p[i].cat1 + p[i].cat2 + p[i].cat3 + p[i].cat4 + p[i].cat5;
            System.out.println("TOTAl MARKS="+total);
            System.out.println("--------------------------------------------------");
        }
        System.out.println("Winner of this quiz is :"+p[temp].name+" with "+p[temp].score+" marks");
    }
}
class players{
    String name;
    int score;
    int cat1,cat2,cat3,cat4,cat5;
}
class question{
    String QuestionText;
    String options;
    int correctOption;
    int sco;

    void startQuiz(){
        System.out.println(QuestionText);
        System.out.println(options);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your answer");
        int x=sc.nextInt();
        if(x==correctOption){
            sco++;
        }
        else{
            System.out.println("Incorrect!! The correct answer was: " +correctOption);
        }
    }
}