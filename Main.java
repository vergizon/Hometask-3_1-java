public class Main {
    public static void main(String[] args) {
        int k = 20; //количество рублей, за которую начисляется 1 миля
        int miles; //количество начисленных миль за купленный билет
        int ticketCost = 1019; //стоимость билета

        miles = ticketCost / k;

        System.out.println(miles);
    }
}