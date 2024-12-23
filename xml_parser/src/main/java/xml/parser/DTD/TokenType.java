package xml.parser.DTD;

public enum TokenType {
    LEFT_PAREN, RIGHT_PAREN,

    LEFT_ANGLE, RIGHT_ANGLE, SLASH,

    VALUE,

    // Symbols
    EXCLAMATION, 

    // DTD keywords
    ELEMENT, ATTLIST, ENTITY, NOTATION, REQUIRED, IMPLIED, FIXED, PUBLIC, SYSTEM, NDATA,

    // XML keywords
    XML, VERSION, ENCODING, STANDALONE, DOCTYPE, CDATA, COMMENT, ENTITYREF, CHARREF, PI, XMLNS,

    EOF
}