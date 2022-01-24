public class Student implements Comparable<Student> {
    private Double height;
    private String first_name;
    private String last_name;
    @Override
    public int compareTo(Student o) {
        for (int i = 0; i < this.last_name.length() && i < o.getLast_name().length(); i++) {
            if ((int) this.last_name.charAt(i) == (int) o.getLast_name().charAt(i)) {
                continue;
            } else {
                return (int) this.last_name.charAt(i) - (int) o.getLast_name().charAt(i);
            }
        }
        if (this.last_name.length() < o.last_name.length() || this.last_name.length() > o.last_name.length()) {
            return (this.last_name.length() - o.getLast_name().length());
        }
        return 0;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Student(Double height, String first_name, String last_name) {
        this.height = height;
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
