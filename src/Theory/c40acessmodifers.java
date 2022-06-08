package com.company;

public class c40acessmodifers {
    static class employee {
        private int id;
        private String name;

        public void setName(String n) {
            name = n;
        }
        public String getName() {
            return name;
        }

        public void setId(int i) {
            id = i;
        }
        public int getId() {
            return id;
        }
    }
        public static void main(String[] args) {
            employee harry = new employee();
//    harry.id=45;
//    harry.name="parishkar";//both throws error due to private access modifiers
            harry.setName("parishkar");
            System.out.println(harry.getName());
            harry.setId(45);
            System.out.println(harry.getId());
        }

}