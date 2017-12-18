#!/bin/bash

set -e
errors=0

TOP_DIR=`pwd`

# Run unit tests
lein test || {
    echo "'unit test' failed"
    let errors+=1
}

[ "$errors" -gt 0 ] && {
    echo "There were $errors errors found"
    exit 1
}

echo "Ok : unit tests"
