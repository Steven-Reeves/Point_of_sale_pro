package com.example.steven.pointofsalepro;

/**
 * Created by jakez on 6/6/2017.
 */

public class ItemOption {
    private boolean m_isSelected = false;
    private String m_name = "";
    private float m_cost = 0.0f;

    public ItemOption(String name, float cost) {
        m_name = name;
        m_cost = cost;
    }

    public ItemOption() {}

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
        return m_cost;
    }

    public boolean isSelected() {
        return m_isSelected;
    }

    public void setSelected(boolean selected) {
        m_isSelected = selected;
    }
}
