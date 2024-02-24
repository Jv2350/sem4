// @ts-check
/**
 * @type {import("@hediet/debug-visualizer-data-extraction").LoadDataExtractorsFn}
 */
module.exports = (register, helpers) => {
    register({
        id: "map",
        getExtractions(data, collector, context) {
            if (!(data instanceof Map)) {
                return;
            } 

            collector.addExtraction({
                priority: 1000,
                id: "map",
                name: "Map",
                extractData() {
                    return helpers.asData({
                        kind: { table: true },
                        rows: [...data].map(([k, v]) => ({
                            key: k,
                            value: v,
                        })),
                    });
                },
            });
        },
    });
};