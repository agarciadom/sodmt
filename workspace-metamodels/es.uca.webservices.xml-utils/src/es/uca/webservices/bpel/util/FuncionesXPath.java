package es.uca.webservices.bpel.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Class which defines some useful static methods for XSLT stylesheets.
 *
 * Changelog:
 * - 1.2: millisToDuration was rewritten avoiding the XML Schema package
 *   in the standard library, as it changed behavior and was breaking
 *   some tests. We do not need all of its functionality.
 *
 * @author Antonio García Domínguez
 * @version 1.2
 */
public class FuncionesXPath {
    private static final Pattern patSplitDuration
        = Pattern.compile("(?=[PYMDTHS])|(?<=[PYMDTHS])");
    private static final Pattern patDecimal
        = Pattern.compile("[0-9]+\\.?[0-9]*|[0-9]*\\.[0-9]+");
    private static final long
        MILLIS_IN_SECOND = 1000,
        MILLIS_IN_MINUTE = 60 * MILLIS_IN_SECOND,
        MILLIS_IN_HOUR   = 60 * MILLIS_IN_MINUTE,
        MILLIS_IN_DAY    = 24 * MILLIS_IN_HOUR,
        MILLIS_IN_MONTH  = 30 * MILLIS_IN_DAY,
        MILLIS_IN_YEAR   = 12 * MILLIS_IN_MONTH;

    /**
     * Returns the lower case value of a string
     * @param s     The original string
     * @return        The original string, now in lower case
     */
    public static String toLower(final String s) {
        return s.toLowerCase();
    }

    /**
     *  Prints a message through the standard error stream
     * @param s     The message to be printed
     * @return        s
     */
    public static String debug(final String s) {
        System.err.println(s);
        return s;
    }

    /**
     * Converts an XML Schema 1.0 duration expression to milliseconds. See <a
     * href="http://www.w3.org/TR/xmlschema-2/#duration">here</a> for details.
     * {@link javax.xml.datatype.Duration} is not used, as its implementation
     * has some quirks that we'd prefer to avoid (such as forcing the user to
     * specify all components of the duration through
     * {@link javax.xml.datatype.DatatypeFactory}).
     */
    public static long durationToMillis(String duration) throws IllegalArgumentException {

        // Split string into components and build duration expression with all
        // components, as the DatatypeFactory.newDuration method does not take
        // into account the "may be omitted"
        final String[] elems = patSplitDuration.split(duration);
        double previousValue = 0;
        long result = 0;
        boolean bMIsMonth = true;

        for (String elem : elems) {
            if (patDecimal.matcher(elem).matches()) {
                previousValue = Double.parseDouble(elem);
                continue;
            }

            final char id = elem.charAt(0);
            switch(id) {
                case 'P':
                case '\'':
                    break;
                case 'T':
                    bMIsMonth = false;
                    break;
                case 'Y':
                    result += previousValue * MILLIS_IN_YEAR;
                    break;
                case 'M':
                    result += previousValue * (bMIsMonth
                                               ? MILLIS_IN_MONTH
                                               : MILLIS_IN_MINUTE);
                    break;
                case 'D':
                    result += previousValue * MILLIS_IN_DAY;
                    break;
                case 'H':
                    result += previousValue * MILLIS_IN_HOUR;
                    break;
                case 'S':
                    result += previousValue * MILLIS_IN_SECOND;
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown part identifier in duration: '"
                        + id + "'");
            }
        }

        return result;
    }

    /**
     * Converts milliseconds to an XML Schema 1.0 duration expression. See <a
     * href="http://www.w3.org/TR/xmlschema-2/#duration">here</a> for details.
     *
     * The old version used classes from the {@link javax.xml.datatype} package,
     * but their behavior varied across versions and broke tests often. This new
     * implementation is less complete, but it is enough for now.
     */
    public static String millisToDuration(long millis) {
        final DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ENGLISH);
        final DecimalFormat df = new DecimalFormat("#0.000", dfs);
        return "P0Y0M0DT0H0M" + df.format(millis/1000.0) + "S";
    }
}
