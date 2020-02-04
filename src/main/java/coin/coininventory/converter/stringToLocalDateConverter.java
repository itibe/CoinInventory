package coin.coininventory.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;


@Converter
public  class stringToLocalDateConverter implements AttributeConverter<String, LocalDate> {

    @Override
    public LocalDate convertToDatabaseColumn(String attribute) {
        return (attribute == null ? null : LocalDate.parse(attribute));
    }

    @Override
    public String convertToEntityAttribute(LocalDate dbData) {
        return dbData.toString();
    }
}
