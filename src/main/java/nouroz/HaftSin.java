package nouroz;

public class HaftSin {
    public String ayaJoziazanast(String sib) {
//        String natije = "";
//        switch (sib){
//            case "Sib":
//            case "Sir":
//            case "Samanou":
//            case "Serke":
//            case "Seke":
//            case "Somagh":
//            case "Senjed":
//                natije = "Ejbari";
//                   break;
//            case "mahi":
//            case "sham":
//            case "saat":
//            case "ayne":
//            case "shirini":
//                natije = "Ekhtyari";
//                break;
//            default:
//                natije = "jozi az haft sin nist";
//                break;
//        }
//        return natije;
//
        return switch (sib) {
            case "Sib", "Sir", "Samanou", "Serke", "Seke", "Somagh", "Senjed" -> "Ejbari";
            case "mahi", "sham", "saat", "ayne", "shirini" ->
                    {
                        System.out.println("Momkene bazi ashya faramoosh shode bashe");
                        yield "Ekhtyari";

                    }
            default -> "jozi az haft sin nist";
        };
    }
}
