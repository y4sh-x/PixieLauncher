/*
 * Zalith Launcher 2
 * Copyright (C) 2025 MovTery <movtery228@qq.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/gpl-3.0.txt>.
 */

package com.movtery.zalithlauncher.ui.code_editor.scheme

import io.github.rosemoe.sora.widget.schemes.EditorColorScheme

class SchemeIDEADark: EditorColorScheme(true) {
    override fun applyDefault() {
        super.applyDefault()
        setColor(WHOLE_BACKGROUND, 0xFF101510.toInt())
        setColor(TEXT_NORMAL, 0xFFE2E9DD.toInt())
        setColor(CURRENT_LINE, 0xFF1B241B.toInt())
        setColor(SELECTED_TEXT_BACKGROUND, 0xFF315F3B.toInt())
        setColor(SELECTION_INSERT, 0xFFD9E7D2.toInt())
        setColor(LINE_NUMBER_BACKGROUND, 0xFF151C15.toInt())
        setColor(LINE_NUMBER, 0xFF738173.toInt())
        setColor(LINE_NUMBER_CURRENT, 0xFFC1D0BD.toInt())
        setColor(LINE_DIVIDER, 0xFF354135.toInt())
        setColor(BLOCK_LINE, 0xFF273127.toInt())
        setColor(NON_PRINTABLE_CHAR, 0xFF819080.toInt())
        setColor(SCROLL_BAR_THUMB, 0xFFA6A6A6.toInt())
        setColor(SCROLL_BAR_THUMB_PRESSED, 0xFF565656.toInt())
        setColor(COMPLETION_WND_BACKGROUND, 0xFF202A20.toInt())

        //语法高亮
        setColor(KEYWORD, 0xFFFFC078.toInt())
        setColor(COMMENT, 0xFF829082.toInt())
        setColor(LITERAL, 0xFF9BD87A.toInt())
        setColor(OPERATOR, 0xFFD5E0D2.toInt())
        setColor(IDENTIFIER_NAME, 0xFFE2E9DD.toInt())
        setColor(IDENTIFIER_VAR, 0xFFE6A8D7.toInt())
        setColor(FUNCTION_NAME, 0xFF9CCEFF.toInt())
        setColor(ANNOTATION, 0xFFE5C975.toInt())
        setColor(HTML_TAG, 0xFFE5C975.toInt())
        setColor(ATTRIBUTE_NAME, 0xFFD5E0D2.toInt())
        setColor(ATTRIBUTE_VALUE, 0xFF9BD87A.toInt())

        //问题诊断
        setColor(PROBLEM_ERROR, 0xFFFA6675.toInt())
        setColor(PROBLEM_WARNING, 0xFFF2C55C.toInt())
        setColor(PROBLEM_TYPO, 0xFF7EC482.toInt())

        //其他
        setColor(MATCHED_TEXT_BACKGROUND, 0xFF2D5438.toInt())
        setColor(HIGHLIGHTED_DELIMITERS_BACKGROUND, 0xFF354135.toInt())
    }
}