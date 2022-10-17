public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> wordArray = null;
        while(true) {
            String fullString = sc.nextLine();
            if (fullString.equalsIgnoreCase("end"))
                break;
            wordArray.add(sc.nextLine().split(" "));
        }

        for(String[] word : wordArray){
            String year = null;
            switch (word[0]){

                case "Citizen":
                    year = word[4].split("/")[2];
                    break;
                case "Pet":
                    year = word[2].split("/")[2];
                    break;
            }
        }

    }


}