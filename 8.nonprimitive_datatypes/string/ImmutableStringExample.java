class ImmutableStringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World");
        System.out.println(str);

        String newStr = str.concat(" Rutik!");
        System.out.println(newStr);
    }
}
