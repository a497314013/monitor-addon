package org.claspina.confirmdialog.i18n.captions;

import org.claspina.confirmdialog.ButtonType;

import java.util.ListResourceBundle;


/**
 * I18n for the button captions. This class contains the translations for language code 'pl'.
 */
public class ButtonCaptions_pl extends ListResourceBundle {

    /**
     * See {@link ListResourceBundle#getContents()}
     */
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {ButtonType.OK.name(), "OK"},
                {ButtonType.ABORT.name(), "Przerwij"},
                {ButtonType.CANCEL.name(), "Anuluj"},
                {ButtonType.YES.name(), "Tak"},
                {ButtonType.NO.name(), "Nie"},
                {ButtonType.CLOSE.name(), "Zamknij"},
                {ButtonType.SAVE.name(), "Zapisz"},
                {ButtonType.RETRY.name(), "Powtórz"},
                {ButtonType.IGNORE.name(), "Pomiń"},
                {ButtonType.HELP.name(), "Pomoc"},
        };
    }

}

