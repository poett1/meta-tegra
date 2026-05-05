SRC_REPO = "github.com/OE4T/nvidia-kernel-oot;protocol=https"
SRC_URI = "gitsm://${SRC_REPO};branch=${SRCBRANCH}"
SRCBRANCH = "patches-r36.4.4"
SRCREV = "c51b17c5da3103de5c4b1b3ef9d6f4cf183d540b"
PV = "36.4.4+git"

require nvidia-kernel-oot.inc
