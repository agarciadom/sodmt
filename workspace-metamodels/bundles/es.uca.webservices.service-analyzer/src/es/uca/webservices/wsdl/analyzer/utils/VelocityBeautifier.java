/*
 *  Copyright 2011 Antonio García-Domínguez (antonio.garciadominguez@uca.es)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package es.uca.webservices.wsdl.analyzer.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Simple beautifier which puts each XML element in a different line and
 * properly indents everything. We can't beautify it with a regular XML
 * beautifier, as it is not valid XML.
 *
 * @author Antonio García-Domínguez
 */
public class VelocityBeautifier {

	private final static Pattern TAG_PATTERN = Pattern.compile("<.*?>");

	private int charsPerLevel = 2;
	private char indentChar = ' ';

	public int getCharsPerLevel() {
		return charsPerLevel;
	}

	public void setCharsPerLevel(int charsPerLevel) {
		this.charsPerLevel = charsPerLevel;
	}

	public char getIndentChar() {
		return indentChar;
	}

	public void setIndentChar(char indentChar) {
		this.indentChar = indentChar;
	}

	public String beautify(String rawTemplate) {
		if (rawTemplate == null) {
			return null;
		}

		Matcher matcher = TAG_PATTERN.matcher(rawTemplate);
		int lastEnd = 0, level = 0;
		boolean atLineBeginning = true;
		StringBuffer sbuf = new StringBuffer();
		while (matcher.find()) {
			final String tag = matcher.group();

			// Append the text content that was not part of the previous tag
			final String prefix = rawTemplate.substring(lastEnd, matcher.start()).trim();
			if (prefix.length() > 0) {
				newIndentedLineIfRequired(atLineBeginning, level, sbuf);
				sbuf.append(prefix);
				atLineBeginning = false;
			}

			if (tag.startsWith("</")) {
				// Closing tag - add newline, indent with one level less
				sbuf.append('\n');
				level = Math.max(0, level - 1);
				indent(level, sbuf);
				sbuf.append(tag);
				atLineBeginning = false;
			}
			else if (tag.endsWith("/>")) {
				// Standalone tag
				newIndentedLineIfRequired(atLineBeginning, level, sbuf);
				sbuf.append(tag);
				atLineBeginning = false;
			}
			else {
				// Opening tag
				newIndentedLineIfRequired(atLineBeginning, level, sbuf);
				sbuf.append(tag);
				sbuf.append('\n');
				++level;
				indent(level, sbuf);
				atLineBeginning = true;
			}

			lastEnd = matcher.end();
		}

		// Add content after last tag
		final String suffix = rawTemplate.substring(lastEnd).trim();
		if (suffix.length() > 0) {
			newIndentedLineIfRequired(atLineBeginning, level, sbuf);
			sbuf.append(suffix);
		}

		return sbuf.toString();
	}

	private void newIndentedLineIfRequired(boolean atLineBeginning, int level,
			StringBuffer sbuf) {
		if (!atLineBeginning) {
			sbuf.append('\n');
			indent(level, sbuf);
		}
	}

	private void indent(int level, StringBuffer sbuf) {
		for (int indent = 0; indent < charsPerLevel * level; ++indent) {
			sbuf.append(indentChar);
		}
	}
}
