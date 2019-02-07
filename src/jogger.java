public class jogger {
    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(sleepIn(true, false));

        System.out.println(stringTimes("hey", 4));

        System.out.println(helloName("Maria"));

        int[] arr = {1, 2, 6};

        System.out.println(firstLast6(arr));

        System.out.println(cigarParty(12, false));

        System.out.println(loneSum(5, 6, 7));

        System.out.println(doubleChar("Carly"));

        System.out.println(countYZ("yuck zoo"));

        System.out.println(bigDiff(arr));

        System.out.println(maxSpan(arr));

    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if ((isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60)) {
            return true;
        } else {
            return false;
        }
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (a == c)
            return b;
        else
            return a + b + c;

    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;

    }

    public static int countYZ(String str) {
        int carly = str.length();
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < carly; i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if (i < carly - 1 && !Character.isLetter(str.charAt(i + 1)))
                    count++;
                else if (i == carly - 1)
                    count++;
            }
        }
        return count;

    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }

    public static int maxSpan(int[] nums) {
        int span = 0;
        int carly = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    carly = j - i + 1;
                    span = Math.max(carly, span);
                }
            }
        }
        return span;
    }
}
