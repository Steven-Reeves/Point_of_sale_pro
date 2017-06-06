package com.example.steven.pointofsalepro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jakez on 6/5/2017.
 */

public class Item implements Serializable {
    private String m_name = "";
    private float m_cost = 0.0f;
    private ArrayList<ItemOption> m_options = new ArrayList<>();

    public Item(String name, float cost) {
        m_name = name;
        m_cost = cost;
    }

    public Item() {}

    public void setName(String name) {
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public void setCost(float cost) {
        m_cost = cost;
    }

    public float getCost() {
        float total = m_cost;

        // Add the cost of all selected options to the initial cost of the item
        for (Iterator<ItemOption> i = m_options.iterator(); i.hasNext();) {
            ItemOption op = i.next();

            if(op.isSelected()) {
                // Add the cost of the selected option to the item total
                total += op.getCost();
            }
        }

        return total;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            // Comparing with itself
            return true;
        }
        else if (!(object instanceof Item)) {
            // object is not an Item
            return false;
        }
        else {
            Item other = (Item) object;

            if (m_name == other.m_name && m_cost == other.m_cost && m_options == other.m_options) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void AddOption(ItemOption option) {
        m_options.add(option);
    }

    public ArrayList<ItemOption> getOptions() { return m_options; }
}
