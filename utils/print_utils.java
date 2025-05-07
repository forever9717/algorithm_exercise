package utils;

import java.util.Map;

public class print_utils {

    private static String space = ",";

    public static void log_info(String detail) {
        System.out.println(detail);
    }

    public static void log_info(String label, String detail) {
        System.out.println(label + ": " + detail);
    }

    public static void log_info(String label, long detail) {
        System.out.println(label + ": " + detail);
    }

    public static void log_info(long detail) {
        System.out.println(detail);
    }

    public static void log_info(double detail) {
        System.out.println(detail);
    }

    public static void log_info(String label, double detail) {
        System.out.println(label + ": " + detail);
    }

    public static void log_info(String label, int detail) {
        System.out.println(label + ": " + detail);
    }



    public static void log_info(String label, Map<Double, Integer> detail) {
        System.out.print(label + ": {");
        for (Map.Entry<Double, Integer> entry: detail.entrySet()) {
            System.out.print("(" + entry.getKey() + ": " + entry.getValue() + "),");
        } 
        System.out.println("}");
    }

    public static void log_info(String label, int[] data) {
        int N = data.length;
        int line_count = 4;
        int n = N/line_count;
        int m = N%line_count;
        int count = 0;

        System.out.print(label + ": [");
        for (int i=0; i<n; i++) {
            for (int j=0; j<line_count; j++) {
                System.out.print(data[count++] + space);
            }
            System.out.print("\n");
        }

        for (int i=0; i<m; i++) {
            System.out.print(data[count++] + space);
        }
        System.out.println("]");
    }


    public static void log_info(double[] data) {
        int N = data.length;
        int line_count = 3;
        int n = N/line_count;
        int m = N%line_count;
        int count = 0;

        System.out.print("[");
        for (int i=0; i<n; i++) {
            for (int j=0; j<line_count; j++) {
                System.out.print(data[count++] + space);
            }
            System.out.print("\n");
        }

        for (int i=0; i<m; i++) {
            System.out.print(data[count++] + space);
        }
        System.out.println("]");
    }

    public static void log_info(String label, double[] data) {
        int N = data.length;
        int line_count = 3;
        int n = N/line_count;
        int m = N%line_count;
        int count = 0;

        System.out.print(label + ": [");
        for (int i=0; i<n; i++) {
            for (int j=0; j<line_count; j++) {
                System.out.print(data[count++] + space);
            }
            System.out.print("\n");
        }

        for (int i=0; i<m; i++) {
            System.out.print(data[count++] + space);
        }
        System.out.println("]");
    }


    public static void log_info(String[] data) {
        int N = data.length;
        int line_count = 2;
        int n = N/line_count;
        int m = N%line_count;
        int count = 0;

        System.out.print("[");
        for (int i=0; i<n; i++) {
            for (int j=0; j<line_count; j++) {
                System.out.print(data[count++] + space);
            }
            System.out.print("\n");
        }

        for (int i=0; i<m; i++) {
            System.out.print(data[count++] + space);
        }
        System.out.println("]");
    }


    public static void log_info(String label, String[] data) {
        int N = data.length;
        int line_count = 2;
        int n = N/line_count;
        int m = N%line_count;
        int count = 0;

        System.out.print(label + ": [");
        for (int i=0; i<n; i++) {
            for (int j=0; j<line_count; j++) {
                System.out.print(data[count++] + space);
            }
            System.out.print("\n");
        }

        for (int i=0; i<m; i++) {
            System.out.print(data[count++] + space);
        }
        System.out.println("]");
    }


}
