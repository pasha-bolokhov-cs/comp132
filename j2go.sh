#!/usr/bin/env sh

sed 's/System\.out\.print/fmt.Print/g' | sed 's/double/float64/g' |
	sed 's/String/string/g' | sed 's/public\s*//' |
	sed 's/class/type struct/'


