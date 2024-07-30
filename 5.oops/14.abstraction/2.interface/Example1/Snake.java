class Snake implements Animal {

    @Override
    public void talk(){
        System.out.println("I am a Snake, I belongs to "+Animal.type2+" family.");
    }

    @Override
    public void see(){
        System.out.println("I can see only black colors.");
    }

    @Override
    public void move(){
        System.out.println("I move by crawling.");
    }
}
