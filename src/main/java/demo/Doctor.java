package demo;

public class Doctor implements Staff {
    private  String qualifications;

    public Doctor(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }



    public void assist(){
        System.out.println("Doctor is assisting");
    }
}
