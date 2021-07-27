public class Main {
    public static void main(String[] args) {
        int K = 20; //количество рублей, за которую начисляется 1 миля
        int miles; //количество начисленных миль за купленный билет
        int ticketCost = 1575; //стоимость билета

        if (ticketCost/K >= 1) {

            miles = ticketCost / K;
        }
        else {
                miles = 0;
                }
                System.out.println(miles);
    }
}