package xml.parser.XML;

// TODO: maybe is better to only use value instead of Number and String

public enum TokenType {
    LEFT_PAREN, RIGHT_PAREN,

    LEFT_ANGLE, RIGHT_ANGLE, SLASH,

    IDENTIFIER,

    NUMBER, STRING,

    // Symbols
    EXCLAMATION, 

    // DTD keywords
    ELEMENT, ATTLIST, ENTITY, NOTATION, REQUIRED, IMPLIED, FIXED, PUBLIC, SYSTEM, NDATA,

    // XML keywords
    XML, VERSION, ENCODING, STANDALONE, DOCTYPE, CDATA, COMMENT, ENTITYREF, CHARREF, PI, XMLNS,

    EOF
}