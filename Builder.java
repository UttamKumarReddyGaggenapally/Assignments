interface Housetype
{
    public void families(String No);

    public void ownership(String type);
}

class House implements Housetype
{

    private String No;
    private String type;

    public void families(String No)
    {
        this.No = No;
    }

    public void ownership(String type)
    {
        this.type = type;
    }

}


interface HouseBuilder
{

    public void buildfamilies();

    public void buildownership();
}

class Duplex implements HouseBuilder
{
    private House house;

    public Duplex()
    {
        this.house = new House();
    }

    public void buildfamilies()
    {
        house.families("1");
    }

    public void buildownership()
    {
        house.ownership("single");
    }


    public House getHouse()
    {
        return this.house;
    }
}

class Onefloor implements HouseBuilder
{
    private House house;

    public Onefloor()
    {
        this.house = new House();
    }

    public void buildfamilies()
    {
        house.families("2");
    }

    public void buildownership()
    {
        house.ownership("2");
    }

    public House getHouse()
    {
        return this.house;
    }

}

class Building
{

    private HouseBuilder houseBuilder;

    public  Building(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse()
    {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse()
    {
        this.houseBuilder.buildfamilies();
        this.houseBuilder.buildownership();
    }
}

class Builder
{
    public static void main(String[] args)
    {
        HouseBuilder duplex = new Duplex();
        Building engineer = new Building(duplex);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
