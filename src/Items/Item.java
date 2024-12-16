package Items;

import java.util.Objects;

public abstract class Item {
    private String it_name;
    It_info info;
    public It_info getItInfo() {
        return info;
    }
/*
    private Item_type curr_type = Item_type.NONE;

    public Item(String it_name) {
        this.it_name = it_name;
    }

    public String getName() {
        return it_name;
    }

    public void setName(String it_name) {
        this.it_name = it_name;
    }



    @Override
    public String toString() {
        return it_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(it_name, item.it_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(it_name);
    }

 */
}
