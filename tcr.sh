#!/bin/bash

source "scripts/test.sh"
source "scripts/commit.sh"
source "scripts/revert.sh"

test && commit || revert
