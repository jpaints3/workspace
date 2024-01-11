import fileinput
import json


def load_json(json_filename):
    """This is a function that loads and reads a json file.

    Args:
        json_file (string): the name of the json file to be read.
    """
    with open(json_filename, encoding="utf-8") as json_file:
       return json.load(json_file)

def convert_to_yaml(json_text):
    # enter each object
    # split until you encounter an error
    # take each piece and convert that to yaml
    # merge the pieces
    # return the completed yaml text
    pass



def main():
    json_filename = input()
    json_text = load_json(json_filename)
    yaml_text = convert_to_yaml(json_text)

main()


