package dev.trxsson.test.utils;

public class MessageTransformer {
    
    public static String replaceUnicodeCharacters(String input) {
        return input
                .replace("\\uE000", "\uE000")
                .replace("\\uE001", "\uE001")
                .replace("\\uE002", "\uE002")
                .replace("\\uE003", "\uE003")
                .replace("\\uE004", "\uE004")
                .replace("\\uE005", "\uE005")
                .replace("\\uE006", "\uE006")
                .replace("\\uE007", "\uE007")
                .replace("\\uE008", "\uE008")
                .replace("\\uE009", "\uE009")
                .replace("\\uE010", "\uE010")
                .replace("\\uE011", "\uE011")
                .replace("\\uE012", "\uE012")
                .replace("\\uE013", "\uE013")
                .replace("\\uE014", "\uE014")
                .replace("\\uE015", "\uE015")
                .replace("\\uE016", "\uE016")
                .replace("\\uE017", "\uE017")
                .replace("\\uE018", "\uE018")
                .replace("\\uE019", "\uE019")
                .replace("\\uE020", "\uE020")
                .replace("\\uE021", "\uE021")
                .replace("\\uE022", "\uE022");
    }
}
