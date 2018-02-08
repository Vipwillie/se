package excel;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/12 14:12</p>
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String addr;
    private String tel;
    private String note;

    public Student() {
    }

    public Student(String name, int age, String gender, String addr, String tel, String note) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
        this.tel = tel;
        this.note = note;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

