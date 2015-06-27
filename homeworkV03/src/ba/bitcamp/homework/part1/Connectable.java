package ba.bitcamp.homework.part1;

public interface Connectable {

void connect (Computer c)throws IllegalArgumentException;
void connect (Network n)throws IllegalArgumentException;
void disconnect();

}
