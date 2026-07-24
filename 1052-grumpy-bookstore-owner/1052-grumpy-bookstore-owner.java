class Solution {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int alreadySatisfied = satisfiedCustomers(customers, grumpy);

        int extraSatisfied = firstWindow(customers, grumpy, minutes);
        int maxExtra = extraSatisfied;

        for (int i = minutes; i < customers.length; i++) {

            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                extraSatisfied -= customers[i - minutes];
            }

            if (extraSatisfied > maxExtra) {
                maxExtra = extraSatisfied;
            }
        }

        return alreadySatisfied + maxExtra;
    }

    static int satisfiedCustomers(int[] customers, int[] grumpy) {

        int sum = 0;

        for (int i = 0; i < customers.length; i++) {

            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        return sum;
    }

    static int firstWindow(int[] customers, int[] grumpy, int minutes) {

        int sum = 0;

        for (int i = 0; i < minutes; i++) {

            if (grumpy[i] == 1) {
                sum += customers[i];
            }
        }

        return sum;
    }
}