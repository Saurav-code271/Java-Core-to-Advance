package OOPs.p10_association_aggregation_composition;

// 1. Aggregation: Team has Players.
// Players can exist independently of the Team.
class Player02 {
    String name;

    Player02(String name) {
        this.name = name;
    }
}

class Team02 {
    String name;
    Player02 player;

    Team02(String name, Player02 player) {
        this.name = name;
        this.player = player;
    }

    void show() {
        System.out.println(name + " includes " + player.name);
    }
}

// 2. Composition: House owns Rooms in this model.
class Room02 {
    String type;

    Room02(String type) {
        this.type = type;
    }
}

class House02 {
    private final Room02 room;

    House02() {
        room = new Room02("Bedroom");
    }

    void showRoom() {
        System.out.println("House contains a " + room.type);
    }
}

// 3. Compare aggregation and composition
class Engine02 {
    String type;

    Engine02(String type) {
        this.type = type;
    }
}

class Car02 {
    private final Engine02 engine;

    // Engine is created internally for this example.
    Car02() {
        engine = new Engine02("Petrol Engine");
    }

    void showEngine() {
        System.out.println(engine.type);
    }
}

public class RelationshipPartTwo02 {
    public static void main(String[] args) {
        Player02 player = new Player02("Virat");
        Team02 team = new Team02("India", player);
        team.show();

        House02 house = new House02();
        house.showRoom();

        Car02 car = new Car02();
        car.showEngine();
    }
}

// Output:

//India includes Virat
//House contains a Bedroom
//Petrol Engine

// 1. Key points for interviews:

//    Relationship	Meaning	                                                    Example

// 1. Association	Objects interact or are related	                            Teacher–Student
// 2. Aggregation	Whole refers to an independently existing part	            Team–Player
// 3. Composition	Whole owns and manages its part's lifecycle in the model	House–Room

// 2. Remember: Java does not enforce aggregation or composition automatically.
// These are design concepts expressed through how objects are created, referenced, and managed.
