package de.sdo.demo.crosscutting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

@FacesConverter("customDateConverter")
public class CustomDateConverter implements Converter<Date> {

    private final Locale locale = new Locale("de", "DE"); // German locale
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", locale);

    @Override
    public Date getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return dateFormat.parse(value);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format", e);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Date value) {
        if (value == null) {
            return "";
        }
        return dateFormat.format(value);
    }
}
