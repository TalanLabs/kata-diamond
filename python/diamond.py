ALPHABET = list('ABCDEFGHIJKLMNOPQRSTUVWXYZ')

def fmt(letter, o_tab, m_tab):
    return f"{o_tab}{letter}{m_tab}{letter}{o_tab}"

def rows(letter):
    nb = ALPHABET.index(letter)
    indent = ' ' * nb
    lines = [f"{indent}A{indent}"]
    if nb == 0:
        return lines

    center, idx = ' ', 1
    while indent:
        indent = indent[1:]
        lines.append(fmt(ALPHABET[idx], indent, center))
        center += '  '
        idx += 1
    for line in reversed(lines[:-1]):
        lines.append(line)
    return lines