abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Data is saved in File";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Data is saved in Database";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	FilePersistence Fp=new FilePersistence();
    	System.out.println(Fp.persist());
    	DatabasePersistence Dp=new DatabasePersistence();
    	System.out.println(Dp.persist());
    }
}