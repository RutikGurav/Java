class Human implements Animal {

    @Override
    public void talk(){
        System.out.println("I am a Human, I belongs to "+Animal.type1+" family.");
    }

    @Override
    public void see(){
        System.out.println("I can see all the colors.");
    }

    @Override
    public void move(){
        System.out.println("I move by walking.");
    }
}
