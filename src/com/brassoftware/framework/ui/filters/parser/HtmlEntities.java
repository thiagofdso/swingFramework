/**
 * Author: Luis M Pena ( lu@coderazzi.net ) License: MIT License
 *
 * Copyright (c) 2007 Luis M. Pena - lu@coderazzi.net
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.brassoftware.framework.ui.filters.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to encode all the possible HTML entities
 */
class HtmlEntities {

    /**
     * Returns the integer value associated to the given entity, or -1 if it is
     * not a proper HTML entity
     */
    public static int getEntityValue(String entity) {
        Integer value = ents.get(entity);
        return value == null ? -1 : value;
    }

    private static final Map<String, Integer> ents = new HashMap<>();

    static {
        ents.put("Aacute", 193);
        ents.put("aacute", 225);
        ents.put("Acirc", 194);
        ents.put("acirc", 226);
        ents.put("acute", 180);
        ents.put("AElig", 198);
        ents.put("aelig", 230);
        ents.put("Agrave", 192);
        ents.put("agrave", 224);
        ents.put("alefsym", 8501);
        ents.put("Alpha", 913);
        ents.put("alpha", 945);
        ents.put("amp", 38);
        ents.put("and", 8743);
        ents.put("ang", 8736);
        ents.put("Aring", 197);
        ents.put("aring", 229);
        ents.put("asymp", 8776);
        ents.put("Atilde", 195);
        ents.put("atilde", 227);
        ents.put("Auml", 196);
        ents.put("auml", 228);
        ents.put("bdquo", 8222);
        ents.put("Beta", 914);
        ents.put("beta", 946);
        ents.put("brvbar", 166);
        ents.put("bull", 8226);
        ents.put("cap", 8745);
        ents.put("Ccedil", 199);
        ents.put("ccedil", 231);
        ents.put("cedil", 184);
        ents.put("cent", 162);
        ents.put("Chi", 935);
        ents.put("chi", 967);
        ents.put("circ", 710);
        ents.put("clubs", 9827);
        ents.put("cong", 8773);
        ents.put("copy", 169);
        ents.put("crarr", 8629);
        ents.put("cup", 8746);
        ents.put("curren", 164);
        ents.put("Dagger", 8225);
        ents.put("dagger", 8224);
        ents.put("dArr", 8659);
        ents.put("darr", 8595);
        ents.put("deg", 176);
        ents.put("Delta", 916);
        ents.put("delta", 948);
        ents.put("diams", 9830);
        ents.put("divide", 247);
        ents.put("Eacute", 201);
        ents.put("eacute", 233);
        ents.put("Ecirc", 202);
        ents.put("ecirc", 234);
        ents.put("Egrave", 200);
        ents.put("egrave", 232);
        ents.put("empty", 8709);
        ents.put("emsp", 8195);
        ents.put("ensp", 8194);
        ents.put("Epsilon", 917);
        ents.put("epsilon", 949);
        ents.put("equiv", 8801);
        ents.put("Eta", 919);
        ents.put("eta", 951);
        ents.put("ETH", 208);
        ents.put("eth", 240);
        ents.put("Euml", 203);
        ents.put("euml", 235);
        ents.put("euro", 8364);
        ents.put("exist", 8707);
        ents.put("fnof", 402);
        ents.put("forall", 8704);
        ents.put("frac12", 189);
        ents.put("frac14", 188);
        ents.put("frac34", 190);
        ents.put("frasl", 8260);
        ents.put("Gamma", 915);
        ents.put("gamma", 947);
        ents.put("ge", 8805);
        ents.put("gt", 62);
        ents.put("hArr", 8660);
        ents.put("harr", 8596);
        ents.put("hearts", 9829);
        ents.put("hellip", 8230);
        ents.put("Iacute", 205);
        ents.put("iacute", 237);
        ents.put("Icirc", 206);
        ents.put("icirc", 238);
        ents.put("iexcl", 161);
        ents.put("Igrave", 204);
        ents.put("igrave", 236);
        ents.put("image", 8465);
        ents.put("infin", 8734);
        ents.put("int", 8747);
        ents.put("Iota", 921);
        ents.put("iota", 953);
        ents.put("iquest", 191);
        ents.put("isin", 8712);
        ents.put("Iuml", 207);
        ents.put("iuml", 239);
        ents.put("Kappa", 922);
        ents.put("kappa", 954);
        ents.put("Lambda", 923);
        ents.put("lambda", 955);
        ents.put("lang", 9001);
        ents.put("laquo", 171);
        ents.put("lArr", 8656);
        ents.put("larr", 8592);
        ents.put("lceil", 8968);
        ents.put("ldquo", 8220);
        ents.put("le", 8804);
        ents.put("lfloor", 8970);
        ents.put("lowast", 8727);
        ents.put("loz", 9674);
        ents.put("lrm", 8206);
        ents.put("lsaquo", 8249);
        ents.put("lsquo", 8216);
        ents.put("lt", 60);
        ents.put("macr", 175);
        ents.put("mdash", 8212);
        ents.put("micro", 181);
        ents.put("middot", 183);
        ents.put("minus", 8722);
        ents.put("Mu", 924);
        ents.put("mu", 956);
        ents.put("nabla", 8711);
        ents.put("nbsp", 160);
        ents.put("ndash", 8211);
        ents.put("ne", 8800);
        ents.put("ni", 8715);
        ents.put("not", 172);
        ents.put("notin", 8713);
        ents.put("Ntilde", 209);
        ents.put("ntilde", 241);
        ents.put("Nu", 925);
        ents.put("nu", 957);
        ents.put("Oacute", 211);
        ents.put("oacute", 243);
        ents.put("Ocirc", 212);
        ents.put("ocirc", 244);
        ents.put("OElig", 338);
        ents.put("oelig", 339);
        ents.put("Ograve", 210);
        ents.put("ograve", 242);
        ents.put("oline", 8254);
        ents.put("Omega", 937);
        ents.put("omega", 969);
        ents.put("Omicron", 927);
        ents.put("omicron", 959);
        ents.put("oplus", 8853);
        ents.put("or", 8744);
        ents.put("ordf", 170);
        ents.put("ordm", 186);
        ents.put("Oslash", 216);
        ents.put("oslash", 248);
        ents.put("Otilde", 213);
        ents.put("otilde", 245);
        ents.put("otimes", 8855);
        ents.put("Ouml", 214);
        ents.put("ouml", 246);
        ents.put("para", 182);
        ents.put("part", 8706);
        ents.put("permil", 8240);
        ents.put("perp", 8869);
        ents.put("Phi", 934);
        ents.put("phi", 966);
        ents.put("Pi", 928);
        ents.put("pi", 960);
        ents.put("piv", 982);
        ents.put("plusmn", 177);
        ents.put("pound", 163);
        ents.put("Prime", 8243);
        ents.put("prime", 8242);
        ents.put("prod", 8719);
        ents.put("prop", 8733);
        ents.put("Psi", 936);
        ents.put("psi", 968);
        ents.put("quot", 34);
        ents.put("radic", 8730);
        ents.put("rang", 9002);
        ents.put("raquo", 187);
        ents.put("rArr", 8658);
        ents.put("rarr", 8594);
        ents.put("rceil", 8969);
        ents.put("rdquo", 8221);
        ents.put("real", 8476);
        ents.put("reg", 174);
        ents.put("rfloor", 8971);
        ents.put("Rho", 929);
        ents.put("rho", 961);
        ents.put("rlm", 8207);
        ents.put("rsaquo", 8250);
        ents.put("rsquo", 8217);
        ents.put("sbquo", 8218);
        ents.put("Scaron", 352);
        ents.put("scaron", 353);
        ents.put("sdot", 8901);
        ents.put("sect", 167);
        ents.put("shy", 173);
        ents.put("Sigma", 931);
        ents.put("sigma", 963);
        ents.put("sigmaf", 962);
        ents.put("sim", 8764);
        ents.put("spades", 9824);
        ents.put("sub", 8834);
        ents.put("sube", 8838);
        ents.put("sum", 8721);
        ents.put("sup", 8835);
        ents.put("sup1", 185);
        ents.put("sup2", 178);
        ents.put("sup3", 179);
        ents.put("supe", 8839);
        ents.put("szlig", 223);
        ents.put("Tau", 932);
        ents.put("tau", 964);
        ents.put("there4", 8756);
        ents.put("Theta", 920);
        ents.put("theta", 952);
        ents.put("thetasym", 977);
        ents.put("thinsp", 8201);
        ents.put("THORN", 222);
        ents.put("thorn", 254);
        ents.put("tilde", 732);
        ents.put("times", 215);
        ents.put("trade", 8482);
        ents.put("Uacute", 218);
        ents.put("uacute", 250);
        ents.put("uArr", 8657);
        ents.put("uarr", 8593);
        ents.put("Ucirc", 219);
        ents.put("ucirc", 251);
        ents.put("Ugrave", 217);
        ents.put("ugrave", 249);
        ents.put("uml", 168);
        ents.put("upsih", 978);
        ents.put("Upsilon", 933);
        ents.put("upsilon", 965);
        ents.put("Uuml", 220);
        ents.put("uuml", 252);
        ents.put("weierp", 8472);
        ents.put("Xi", 926);
        ents.put("xi", 958);
        ents.put("Yacute", 221);
        ents.put("yacute", 253);
        ents.put("yen", 165);
        ents.put("Yuml", 376);
        ents.put("yuml", 255);
        ents.put("Zeta", 918);
        ents.put("zeta", 950);
        ents.put("zwj", 8205);
        ents.put("zwnj", 8204);
    }
}
