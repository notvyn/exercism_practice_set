#include <string>
using namespace std;

namespace log_line {
    string message(string line) {
        int index = line.find(":"), lineLength = line.length();
        string result = "";
        
        for (int i = index+2; i < lineLength; i++) {
            result += line[i];
        }
        
        return result;
        // return the message
    }
    
    string log_level(string line) {
        int index = line.find(":");
        string result = "";
        
        for (int i = 0; i < index; i++) {
            if (line[i] == '[' || line [i] == ']') {
                continue;
            }
            result += line[i];
        }
        
        return result;
        // return the log level
    }
    
    string reformat(string line) {
        return message(line) + " (" + log_level(line) + ")";
        // return the reformatted message
    }
}  // namespace log_line
