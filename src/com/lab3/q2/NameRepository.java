package com.lab3.q2;

public class NameRepository implements Aggregate {
    private String names[][] = {{"Apple", "Banana"}, {"Pork", "Beef", "Chicken"}, {"Carrots"}};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int x = -1, y = -1;

        @Override
        public boolean hasNext() {

            for (String[] line : names) {
                for (String item : line) {
                    if (item != "-")
                        return true;
                }
            }

            return false;
        }

        @Override
        public Object next() {

            for (int _x = x; _x < names.length; x++) {

                for (int _y = y; y < names[_x].length; _y++) {

                    if (names[x][y] != "-") {
                        y = _y;
                        x = _x;
                        return names[x][y];
                    }

                }
            }
            return null;
        }
    }
}

