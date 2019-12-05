package at.itproject.core;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class LineChartDto {

    private String measurement;
    private Set<String> tag_set;
    private Set<String> field_set;

    public Set<String> getTag_set(){
        if(tag_set == null){
            tag_set = new HashSet<>();
        }
        return tag_set;
    }

    public Set<String> getField_set(){
        if(field_set == null){
            field_set = new HashSet<>();
        }
        return field_set;
    }

    public String toString(){

        String tags = String.join(",", tag_set);
        String fields = String.join(",", field_set);

        return measurement + "," + tags + " " + fields;
    }

}
