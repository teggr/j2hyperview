package dev.rebelcraft.j2hyperview.tags;


public class HyperviewContentJoiner {

    public static UnescapedText join(CharSequence delimiter, boolean fixPeriodAndCommaSpacing, Object... stringOrDomObjects) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringOrDomObjects.length; i++) {
            Object o = stringOrDomObjects[i];
            if (o instanceof String) {
                sb.append(((String) o).trim());
            } else if (o instanceof HyperviewContent) {
                sb.append(((HyperviewContent) o).render().trim());
            } else if (o == null) {
                //Discard null objects so iff/iffelse can be used with join
                continue;
            } else {
                throw new RuntimeException("You can only join HyperviewContent and String objects");
            }
            if (i < stringOrDomObjects.length-1) {
                sb.append(delimiter);
            }
        }
        String joined = sb.toString().trim();
        if (fixPeriodAndCommaSpacing) {
            joined = joined.replaceAll("\\s\\.", ".");
            joined = joined.replaceAll("\\s\\,", ",");
        }
        return new UnescapedText(joined);
    }

}
