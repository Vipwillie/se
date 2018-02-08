package excel.jxls;

import java.util.Date;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2017/12/21 11:20</p>
 */
public class Student {
    private String stuNo;
    private String name;
    private Integer age;
    private Date birth;
    private String gender;
    private Double score;

    public Student(String stuNo, String name, Integer age, Date birth, String gender, Double score) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.gender = gender;
        this.score = score;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}
