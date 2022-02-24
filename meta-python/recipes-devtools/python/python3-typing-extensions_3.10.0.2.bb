HOMEPAGE = "https://github.com/python/typing"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

# The name on PyPi is slightly different.
PYPI_PACKAGE = "typing_extensions"

SRC_URI = "https://files.pythonhosted.org/packages/ed/12/c5079a15cf5c01d7f4252b473b00f7e68ee711be605b9f001528f0298b98/typing_extensions-3.10.0.2.tar.gz"
SRC_URI[md5sum] = "ed80ecc8eac5cb15840535ca54eb43f3"
SRC_URI[sha256sum] = "49f75d16ff11f1cd258e1b988ccff82a3ca5570217d7ad8c5f48205dd99a677e"

S = "${WORKDIR}/typing_extensions-3.10.0.2"

RDEPENDS_${PN} = ""

inherit setuptools3
