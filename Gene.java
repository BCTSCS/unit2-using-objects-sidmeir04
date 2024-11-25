public class Gene {
    private String dna;
    private int geneCount;

    public Gene(String g){
        dna = g;
    }

    public static int countNucleotides(String g, Character nucleotide){
        int count = 0;
        for (Character c : g.toCharArray()){
            if (c == nucleotide){
                count++;
            }
        }
        return count;
    }

    public static boolean potentialGene(String dna){
        if(dna.startsWith("atc") && dna.endsWith("tag")){
            if (dna.length()%3==0){
                return true;
            }
        }
        return false;
    }

    public static int findStopCodon(String genome, int start){
        if (genome.length()%3 != 0) return -1;
        for (int i = start; i < genome.length()-2;i+=3){
            if (genome.substring(i,i+3).equals("TAA")
                || genome.substring(i,i+3).equals("TAG")
                || genome.substring(i,i+3).equals("TGA")){
                return i;
            }
        }
        return -1;
    }

    public static String findGenes(String dna, int start){
        int geneStart = -1;
        for (int i = start; i < dna.length()-2;i+=3){
            if(dna.substring(i,i+3).equals("ATG")){
                geneStart = i;
                break;
            }
        }
        if (geneStart == -1) return "";
        int end = findStopCodon(dna, geneStart);
        if (end == -1) return "";
        return dna.substring(geneStart, end);
    }

    
    public static void main(String[] args) {
        System.out.println(findStopCodon("ATGCATAGCGCATAG",0));
        System.out.println(countNucleotides("ATGCATAGCGCATAG",'G'));
        System.out.println(findGenes("ATGCATAGCGCATAG",0));
    }
}
