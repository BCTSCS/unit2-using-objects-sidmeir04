public class President {
    private String name = "Obama";
    private String path_to_picture = "C:/Windows/System32";
    private int term = 4;
    public President(String n, String p, int t){
        name = n;
        path_to_picture = p;
        term = t;
    }

    public String getName(){
        return name;
    }

    public String getPath(){
        return path_to_picture;
    }
    
    public int getTerm(){
        return term;
    }

    public String toString(){
        return "President Name: " + name + " Term: " + term + " PathToPicture: " + path_to_picture;
    }

    public void changePresident(String n, String p){
        name = n;
        path_to_picture = p;
        term++;
    }

    public static void main(String[] args) {
        President president = new President("Donald Trump","C:/Users/oscar/Downloads/download (1).jpg", 4);
        System.out.println(president);
        president.changePresident("Leo Langley", "C:/Users/oscar/Pictures/Screenshots/Screenshot 2024-01-24 222029.png");
        System.out.println(president);

    }
}
