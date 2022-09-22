public class Main {
    public static void main(String[] args) {

        int WeightOfOneBanana= 80;
        int weightOfOneHundredMillilitersOfMilk = 105;
        int weightOfOneBriquetteOfIceCream = 100;
        int weightOfOneEgg = 70;
        float gramsPerKilogram = 1000.0f;

        int totalNumberOfBananas = 5;
        int totalNumberHundredsMillilitersOfMilk = 2;
        int totalNumberOfBriquettesOfIceCream = 2;
        int totalNumberOfEggs = 4;

        int totalWeightOfBananas = WeightOfOneBanana * totalNumberOfBananas;
        int totalWeightOfMilk = totalNumberHundredsMillilitersOfMilk * weightOfOneHundredMillilitersOfMilk;
        int totalWeightOfBriquettesOfIceCream = totalNumberOfBriquettesOfIceCream * weightOfOneBriquetteOfIceCream;
        int totalWeightOfEggs = weightOfOneEgg * totalNumberOfEggs;

        int totalWeightOfTheDish = totalWeightOfBananas + totalWeightOfEggs + totalWeightOfMilk + totalWeightOfBriquettesOfIceCream;
        System.out.println("Вес получившегося блюда в граммах составляет " + totalWeightOfTheDish + " в граммах, или " + (totalWeightOfTheDish / gramsPerKilogram) + " в килограммах");

        //task 6 complete

    }
}