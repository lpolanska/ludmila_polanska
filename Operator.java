public enum Operator {

        Scitani {
            int eval(int n, int m) {
                return n + m;
            }
        },

        Odcitani {
            int eval(int n, int m) {
            return n - m;
            }
        },

        Deleni {
            int eval(int n, int m) {
                return n / m;
            }
        },


        Nasobeni {
            int eval(int n, int m) {
                return n * m;
            }
        };


       abstract int eval(int n, int m);
    }


