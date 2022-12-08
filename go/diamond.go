package diamond

import (
	"errors"
	"fmt"
	"strings"
)

func Gen(char byte) (string, error) {
	if char < 'A' || char > 'Z' {
		return "", errors.New("invalid character given")
	}
	if char == 'A' {
		return string(char), nil
	}

	width := (int(char-'A')*2 + 1)
	sidelength := width / 2

	sides := strings.Repeat(" ", sidelength)
	topLine := fmt.Sprintf("%s%s%s\n", sides, string('A'), sides)
	gap := 1

	topHalf := ""
	for i := byte('A') + 1; i <= char; i++ {
		sidelength--
		sides = strings.Repeat(" ", sidelength)
		between := strings.Repeat(" ", gap)
		line := fmt.Sprintf("%s%s%s%s%s\n", sides, string(i), between, string(i), sides)
		topHalf += line
		gap += 2
	}

	topHalf = topLine + topHalf

	bottomHalf := ""
	sidelength = 1
	for i := char - 1; i > byte('A'); i-- {
		gap = (width - (sidelength * 2) - 2)
		sides = strings.Repeat(" ", sidelength)
		between := strings.Repeat(" ", gap)
		line := fmt.Sprintf("%s%s%s%s%s\n", sides, string(i), between, string(i), sides)
		bottomHalf += line
		sidelength++
	}
	bottomHalf += topLine

	diamond := topHalf + bottomHalf
	diamond = strings.TrimSuffix(diamond, "\n")
	return diamond, nil
}
