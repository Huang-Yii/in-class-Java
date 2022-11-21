package ch2.E202_02_01计算教师工资;

public class Teacher {
        private String name;//姓名
        private int age;//工龄
        private String title;//职称

        public  double endWage(String name,int age,String title){
            double wage = 0;
            if (title.equals("普通")){
                wage = 3000+age*50;
                System.out.println(wage);
            }
            if (title.equals("高级")){
                wage = 5000+age*50;
                System.out.println(wage);
            }
            if (title.equals("特级")){
                wage = 8000+age*50;
                System.out.println(wage);
            }
            return wage;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", title='" + title + '\'' +
                    '}';
        }

}
