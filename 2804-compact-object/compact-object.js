/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {

    if (Array.isArray(obj)) {
        const result = [];

        for (const item of obj) {
            if (Boolean(item)) {
                result.push(
                    typeof item === "object" && item !== null
                        ? compactObject(item)
                        : item
                );
            }
        }

        return result;
    }

    const result = {};

    for (const key in obj) {
        const value = obj[key];

        if (Boolean(value)) {
            result[key] =
                typeof value === "object" && value !== null
                    ? compactObject(value)
                    : value;
        }
    }

    return result;
};