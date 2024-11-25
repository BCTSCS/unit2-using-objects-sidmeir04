public class Gene {
    private String dna;
    private int geneCount;

    public Gene(String g){
        dna = g;
    }

    public int countNucleotides(String g, Character nucleotide){
        int count = 0;
        for (Character c : g.toCharArray()){
            if (c == nucleotide){
                count++;
            }
        }
        return count;
    }

    public boolean potentialGene(String dna){
        if(dna.startsWith("atc") && dna.endsWith("tag")){
            if (dna.length()%3==0){
                return true;
            }
        }
        return false;
    }

    public String findGenes(String dna, int startIndex){
        String str = dna.substring(startIndex);
        int index = str.indexOf("atc");
        int index2 = str.indexOf("tag");
        String finalStr = "";
        while(index != -1){
            if(potentialGene(str.substring(index,index2+3))){
                finalStr = finalStr + str.substring(index+3,index2);

            }
            int index = str.indexOf("atc");
            int index2 = str.indexOf("tag");
        }
        return "";
    }
    
    public static void main(String[] args) {

    }
}
